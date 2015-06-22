(ns cofcod.main
  (:use [org.httpkit.server :only [run-server]])
  (:require [cofcod.handler :refer [app]]))

(defn -main [& args]
  (let [port 8080]
    (println (str "starting " port))
    (run-server app {:port 8080})))
