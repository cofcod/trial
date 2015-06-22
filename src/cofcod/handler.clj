(ns cofcod.handler
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]
            [ring.middleware.reload :refer [wrap-reload]]
            [ring.middleware.stacktrace :refer [wrap-stacktrace]]
            [cofcod.views :as views]))

(defroutes app-routes
  (GET "/" [] (views/index))
  (route/not-found "Not Found"))

(defn production? []
  false)

(def app
  (let [default (wrap-defaults app-routes site-defaults)]
    (if (production?)
      default
      (wrap-stacktrace (wrap-reload default) {:color? true}))))

