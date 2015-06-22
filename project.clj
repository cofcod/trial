(defproject cofcod "0.0.1"
  :description "커피와코드 첫 연습 프로젝트"
  :url "http://example.com/FIXME"
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-3308"]
                 [compojure "1.3.1"]
                 [hiccup "1.0.5"]
                 [ring/ring-defaults "0.1.5"]
                 [ring/ring-devel "1.3.2"]
                 [http-kit "2.1.18"]]
  :plugins [[lein-ring "0.8.13"]
            [lein-cljsbuild "1.0.6"]]
  :ring {:handler cofcod.handler/app}
  :main cofcod.main
  :profiles
  {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                        [ring-mock "0.1.5"]]}})
