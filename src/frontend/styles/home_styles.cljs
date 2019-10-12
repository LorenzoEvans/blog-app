(ns frontend.styles.home-styles
  (:require [herb.core :refer [defglobal]]))

(def anchor-style "b--black bw3 avenir f3")

(defglobal global
  [:body {:margin 0, :min-height "100%"}]
  [:html {:min-height "100vh"}])