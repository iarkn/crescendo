(defproject crescendo "0.1.0-SNAPSHOT"
  :description "Mindustry mod written in Clojure!"
  :url "https://github.com/iarkn/crescendo"
  :license {:name "GPL-3.0-or-later"
            :url "https://www.gnu.org/licenses/gpl-3.0.txt"}
  :min-lein-version "2.0.0"
  :repositories [["jitpack" "https://jitpack.io"]]
  :dependencies [[org.clojure/clojure "1.11.1"]]

  :source-paths ["src/clojure"]
  :java-source-paths ["src/java"]
  :resource-paths ["assets"]

  :main nil
  :omit-source true
  :javac-options ["-source" "8" "-target" "8" "-Xlint:-options"]
  :profiles {:uberjar  {:aot :all}
             :provided {:dependencies
                        [[com.github.anuken.mindustry/core "v135.2"]
                         [com.github.anuken.arc/arc-core "v135.2"]]}})
