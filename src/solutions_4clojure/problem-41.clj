;; 4Clojure Question 41
;;
;; Write a function which drops every Nth item from a sequence.
;;
;; Use M-x 4clojure-check-answers when you're done!

(= ((fn [coll n] (flatten (map #(take (- n 1) %) (partition-all n coll)))) [1 2 3 4 5 6 7 8] 3) [1 2 4 5 7 8])

(= ((fn [coll n] (flatten (map #(take (- n 1) %) (partition-all n coll)))) [:a :b :c :d :e :f] 2) [:a :c :e])

(= ((fn [coll n] (flatten (map #(take (- n 1) %) (partition-all n coll)))) [1 2 3 4 5 6] 4) [1 2 3 5 6])
