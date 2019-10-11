(ns backend.server
  (:require ["express" :as express]
            ["path" :as path]))

(def markup "
 <!DOCTYPE html>
<html lang='en'>
<head>
    <meta charset='UTF-8'>
    <meta name='viewport' content='width=device-width, initial-scale=1.0'>
    <meta http-equiv='X-UA-Compatible' content='ie=edge'>
    <title>Blog</title>
    <link rel='stylesheet' href='https://unpkg.com/tachyons@4.10.0/css/tachyons.min.css'/>

</head>
<body>
        <div id='app' class='hover-bg-washed-blue'></div>
        <script src='/public/main.js'></script>
</body>
</html>")

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
