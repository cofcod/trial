(ns cofcod.views
  (:use [hiccup.core]
        [hiccup.page]
        [hiccup.element]))

(defn common-head []
  [:head
   [:title "커피와코드"]
   (include-css "/css/bootstrap.min.js" "/css/test.css")
   (include-js "/js/jquery.min.js" "/js/bootstrap.min.js"
               "/js/vue.min.js" "/js/test.js")])

(defn navigation []
  [:nav ""])

(defn footer []
  [:footer "copyright(c) 2015"
   (google-analytics)])

(defn google-analytics []
  (javascript-tag ""))

(defn layout [& content]
  (html5 {:lang "ko"}
         (common-head)
         [:body
          (navigation)
          [:main content]
          (footer)]))

(defn index []
  (layout [:h1 "환영합니다!"]
          [:div "to codenamu!"]))
