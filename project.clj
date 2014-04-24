(defproject app "0.1.0"
  :dependencies [[ring "1.2.2"]]
  :plugins [[lein-ring "0.8.10"]]
  :ring {:handler app/handler})