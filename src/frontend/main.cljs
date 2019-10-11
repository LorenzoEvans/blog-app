(ns frontend.main
  (:require [reagent.core :as r]))

(defn htmelement []
  [:div {:class "hover-washed-green"} "yo"])

(defn -main [] (r/render [htmelement] (.getElementById js/document "app")))
(-main)

