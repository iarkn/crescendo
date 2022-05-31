(defproject crescendo "0.1.0-SNAPSHOT"
  :description "Mindustry mod written in Clojure!"
  :license {:name "GPL-3.0-or-later"
            :url "https://www.gnu.org/licenses/gpl-3.0.txt"}
  :repositories [["jitpack" "https://jitpack.io"]]
  :dependencies [[org.clojure/clojure "1.11.1"]]

  :source-paths ["src/clojure"]
  :java-source-paths ["src/java"]
  :resource-paths ["assets"]
  :target-path "target/%s"

  :main nil
  :aot :all
  :profiles {:provided {:dependencies
                        [[com.github.anuken.mindustry/core "v135.2"]
                         [com.github.anuken.arc/arc-core "v135.2"]]}})
