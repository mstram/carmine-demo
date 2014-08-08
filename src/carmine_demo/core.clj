(ns carmine-demo.core
 (require '[taoensso.carmine :as car :refer (wcar) ] ) 
  ;(ns car1
 (:gen-class)
 
)

;leiningen
 ;(require '[taoensso.carmine :as car :refer (wcar) ]  :verbose) ; -> nil

  ;)

(defn run-redis-test1 []
  (def server-conn nil) ; -> #'carmine-demo.core/server-conn
  (defmacro wcar* [& body] `(car/wcar server-conn ~@body)) ; -> #'carmine-demo.core/wcar*

  (wcar*
       (car/ping)
       (car/set "foo" "bar")
       (car/get "foo")
  ) ; -> ["PONG" "OK" "bar"]

  (def g (car/get "foo")) ; -> ["PONG" "OK" "bar"]
  (pr "g" g)
)  
  
(defn -main
  "carmine (clojure -redis demo"
  [& args]
;  (println "-main reached")
  (prn "-main reached")
  (prn "(ns-name ns): " (ns-name ns))
  (run-redis-test1)
 )  ; main
;) ; ns  

