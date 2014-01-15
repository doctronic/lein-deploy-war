(ns leiningen.deploy-artifacts
  (:require [leiningen.deploy :as dep]))

(defn deploy-artifacts
  "Deploy artifacts to remote repository, inheriting project's name, group, and version.

This task lets you deploy arbitrary artifacts from disk without having to specify
the artifacts' name, group, or version. These values are looked up in the current
project.

Example:

      $ lein deploy-artifact myrepo fancypants.jar

This task functions by delegating to the built-in Leiningen deploy task."
  [project repository & files]
  (let [identifier (str (symbol (:group project) (:name project)))
        version (:version project)]
    (apply dep/deploy project repository identifier version files)))
