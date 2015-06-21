(ns cofcod.views
  (:use [hiccup.core]
        [hiccup.page]))

(defn layout [& content]
  (html5 {:lang "ko"}
         [:head
          [:title "커피와코드"]
          (include-css "test.css")
          (include-js "test.js")]
         [:body content]))

(defn index []
  (layout [:h1 "welcome"]
          [:div "to codenamu!"]))
