(defproject buddy/buddy-hashers "0.4.2"
  :description "A collection of secure password hashers for Clojure"
  :url "https://github.com/funcool/buddy-hashers"
  :license {:name "Apache 2.0"
            :url "http://www.apache.org/licenses/LICENSE-2.0"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [buddy/buddy-core "0.5.0"]
                 [clojurewerkz/scrypt "1.2.0"]]
  :source-paths ["src/clojure"]
  :java-source-paths ["src/java"]
  :javac-options ["-target" "1.7" "-source" "1.7" "-Xlint:-options"]
  :test-paths ["test"])