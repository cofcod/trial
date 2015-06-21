(ns cofcod.handler
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]
            [cofcod.views :as views]))

(defroutes app-routes
  (GET "/" [] (views/index))
  (route/not-found "Not Found"))

(def app
  (wrap-defaults app-routes site-defaults))
