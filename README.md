# lein-deploy-war 

A [Leiningen](leiningen.org) plugin to deploy war artifacts from [ring](https://github.com/weavejester/lein-ring) to remote repository,
inheriting project's name, group, and version.

This task lets you deploy arbitrary artifacts from disk without having to specify
the artifacts' name, group, or version. These values are looked up in the current
project. This plugin will also automatically upload to your snapshots and release.

This task functions by delegating to the built-in Leiningen deploy task.

## Usage

Put `[lein-deploy-war "0.1.0"]` into the `:plugins` vector of your
`:user` profile.

Use this for project-level plugins:

Put `[lein-deploy-artifacts "0.1.0"]` into the `:plugins` vector of your project.clj.
You must have a war file in the /target directory of your build with the name <artifactId>-<version>.war.

Example usage:

    $ lein deploy-war

## License

Copyright © 2014

Greg Woodfill

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
