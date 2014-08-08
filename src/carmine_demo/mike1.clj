(ns carmine-demo.mike1
  (:gen-class :verbose)
)

(defn -main
  "carmine (clojure -redis demo"
  [& args]
;  (println "-main reached")
  (prn "-main reached")
  (prn "(ns-name ns): " (ns-name ns))
 )  