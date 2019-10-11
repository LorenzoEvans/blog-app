(ns backend.server
  (:require ["express" :as express]
            ["path" :as path]))

(def markup "
  <div>
    this is a 
    <div id='target' class='hover-bg-washed-blue'></div>
    <script src='/public/main.js'></script>
  </div>")

(defn handle-req [req res]
  (.send res markup))

(defn main! []
  (-> (express)
      (.use "/js/cljs-runtime"
            (.static express
                     (.join path js/__dirname "public/cljs-runtime")))
      (.use "/public"
            (.static express
                     (.join path js/__dirname "public")))
      (.get "*" handle-req)
      (.listen 8080)))
