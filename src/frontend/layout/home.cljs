(ns frontend.layout.home
  (:require
   [herb.core :as h :refer [<class]]
   [frontend.styles.home-styles :refer [anchor-style]]))


; <svg viewBox= "0 0 200 50" >
;  <text font-size= "20" >
;   <tspan textLength= "80" x= "0" y= "1em" font-size= "20" >What is
;   </tspan>
;   <tspan class= "love" textLength= "80" x= "0" dy= "0.9em" font-size= "30" font-weight= "bold" >love
;   </tspan>
;  </text>
; </svg>

; <svg width="400" height="400" xmlns="http://www.w3.org/2000/svg">
;  <!-- Created with Method Draw - http://github.com/duopixel/Method-Draw/ -->
;  <defs>
;   <linearGradient y2="0" x2="1" y1="0" x1="0" id="svg_18">
;    <stop offset="0" stop-color="#ffe2ff"/>
;    <stop offset="1" stop-color="#001d00"/>
;   </linearGradient>
;   <radialGradient cy="0.5" cx="0.5" r="0.50126" spreadMethod="pad" id="svg_22">
;    <stop offset="0" stop-color="#88d8cf"/>
;    <stop offset="1" stop-color="#772730"/>
;   </radialGradient>
;   <linearGradient y2="0" x2="1" y1="0" x1="0" id="svg_26">
;    <stop offset="0" stop-color="#8CD79F"/>
;    <stop offset="1" stop-color="#732860"/>
;   </linearGradient>
;   <linearGradient y2="0" x2="1" y1="0" x1="0" id="svg_27">
;    <stop offset="0" stop-color="#e5e5e5"/>
;    <stop offset="1" stop-color="#1a1a1a"/>
;   </linearGradient>
;  </defs>
;  <g>
;   <title>background</title>
;   <rect fill="url(#svg_27)" id="canvas_background" height="402" width="402" y="-1" x="-1"/>
;   <g display="none" overflow="visible" y="0" x="0" height="100%" width="100%" id="canvasGrid">
;    <rect fill="url(#gridpattern)" stroke-width="0" y="0" x="0" height="100%" width="100%"/>
;   </g>
;  </g>
;  <g>
;   <title>Layer 1</title>
;   <path stroke="#d3bee7" opacity="0.97" id="svg_6" d="m1,199.50001l0,0c0,-109.62852 89.09534,-198.50001 198.99999,-198.50001l0,0c52.77805,0 103.3945,20.91332 140.71421,58.13929c37.31975,37.22598 58.28577,87.71522 58.28577,140.36071l0,0c0,109.6285 -89.09534,198.5 -198.99998,198.5l0,0c-54.95232,0 -104.70232,-22.21788 -140.71423,-58.13931c-36.01192,-35.92144 -58.28576,-85.54644 -58.28576,-140.36069zm99.49999,0l0,0c0,54.81424 44.5477,99.25 99.5,99.25c54.95233,0 99.49999,-44.43576 99.49999,-99.25c0,-54.81425 -44.54768,-99.25001 -99.49999,-99.25001l0,0c-54.9523,0 -99.5,44.43577 -99.5,99.25001z" stroke-width="0" fill="url(#svg_18)"/>
;   <ellipse transform="rotate(-113 199.5,198.453125) " stroke="#ba48ba" opacity="0.96" ry="101" rx="100.00001" id="svg_8" cy="198.45313" cx="199.5" stroke-width="0" fill="url(#svg_22)"/>
;   <path transform="rotate(-180 199.8074951171875,198.33023071289062) " stroke="#D3BEE7" opacity="0.94" id="svg_21" d="m200.80028,97.33023c27.60117,0 49.99281,22.63571 49.99281,50.51088c0,27.87518 -22.39165,50.48911 -49.99281,50.48911c-27.60118,0 -49.99283,22.63573 -49.99283,50.51089c0,27.87518 22.39165,50.48911 49.99283,50.48911c55.20233,0 100.00718,-45.24967 100.00718,-101.00001c0,-55.75035 -44.80485,-100.99999 -100.00718,-100.99999l0,0.00001zm0,34.72623c-8.6298,0 -15.6295,7.06916 -15.6295,15.78465c0,8.7155 6.99968,15.78465 15.6295,15.78465c8.62982,0 15.62948,-7.06916 15.62948,-15.78465c0,-8.71549 -6.99967,-15.78465 -15.62948,-15.78465zm0,101.00001c8.62535,0 15.62948,7.07365 15.62948,15.78465c0,8.71098 -7.00413,15.78466 -15.62948,15.78466c-8.62536,0 -15.6295,-7.07368 -15.6295,-15.78466c0,-8.71098 7.00414,-15.78465 15.6295,-15.78465zm97.76409,-34.6619c0,55.70892 -44.71707,100.86993 -99.87843,100.86993c-55.16133,0 -99.87843,-45.16101 -99.87843,-100.86993c0,-55.70894 44.7171,-100.86997 99.87843,-100.86997c55.16136,0 99.87843,45.16102 99.87843,100.86997z" stroke-width="0" fill="url(#svg_26)"/>
;  </g>
; </svg>

(defn typog []
  [:svg {:style {:background "white"
                 :width "300px"
                 :height "300px"}}
   [:text.avenir {:font-size 10 :class "avenir"}
    [:tspan.avenir {:textLength 250 :x 10 :dy "0.9em" :font-size 35 :font-weight "bold" :class "avenir"} "(ns 0xLE.Blog)"]]])

(defn nav []
  [:div
  [typog]
  [:div "Yo"]])

; (defn sidebar [])