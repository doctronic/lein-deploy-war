# lein-deploy-artifacts

A [Leiningen](leiningen.org) plugin to deploy artifacts to remote repository,
inheriting project's name, group, and version.

This task lets you deploy arbitrary artifacts from disk without having to specify
the artifacts' name, group, or version. These values are looked up in the current
project.

This plugin is useful with continuous build infrastructure that deploys non-JAR
artifacts to repositories (e.g. WAR files).

This task functions by delegating to the built-in Leiningen deploy task.

## Usage

Put `[lein-deploy-artifacts "0.1.0"]` into the `:plugins` vector of your
`:user` profile, or if you are on Leiningen 1.x do `lein plugin install
lein-deploy-artifacts
0.1.0`.

Use this for project-level plugins:

Put `[lein-deploy-artifacts "0.1.0"]` into the `:plugins` vector of your project.clj.

Example usage:

    $ lein deploy-artifacts myrepo fancypants.jar

## License

Copyright © 2014 Alex Chin

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
