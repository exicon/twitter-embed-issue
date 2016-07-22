(set-env!
  :dependencies '[[adzerk/boot-cljs "1.7.228-1"]
                  [adzerk/boot-reload "0.4.12"]
                  [hoplon/boot-hoplon "0.1.13"]
                  [hoplon/hoplon "6.0.0-alpha14"]
                  [org.clojure/clojure "1.8.0"]
                  [org.clojure/clojurescript "1.8.40"]
                  [pandeiro/boot-http "0.7.3"]]
  :source-paths #{"src"}
  :asset-paths #{"assets"})

(require
  '[adzerk.boot-cljs :refer [cljs]]
  '[adzerk.boot-reload :refer [reload]]
  '[hoplon.boot-hoplon :refer [hoplon prerender]]
  '[pandeiro.boot-http :refer [serve]])

(deftask dev
         "Build twitter-embed-issue for local development."
         []
         (comp
           (serve :port 8000)
           (watch)
           (speak)
           (hoplon)
           (reload)
           (cljs)))

(deftask prod
         "Build twitter-embed-issue for production deployment."
         []
         (comp
           (hoplon)
           (cljs :optimizations :advanced)
           (target :dir #{"target"})))
