(defproject
  twitter-embed-issue
  "0.1.0"
  :dependencies
  [; To help Cursive indent build.boot correctly:
   [boot/core "2.5.5"]

   [adzerk/boot-cljs          "1.7.228-1"]
                  [adzerk/boot-reload        "0.4.12"]
                  [hoplon/boot-hoplon        "0.2.2"]
                  [hoplon/hoplon             "6.0.0-alpha16"]
                  [org.clojure/clojure       "1.8.0"]
                  [org.clojure/clojurescript "1.9.93"]
                  [tailrecursion/boot-jetty  "0.1.3"]]
  :source-paths
  ["src" "assets"])


