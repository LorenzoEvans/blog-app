(ns frontend.main
  (:require [reagent.core :as r]
            [frontend.layout.home :refer [nav]]))

(defn app []
  [nav])

(defn -main [] (r/render [app] (.getElementById js/document "app")))
(-main)

