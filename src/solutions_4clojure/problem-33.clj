;; 4Clojure Question 33
;;
;; Write a function which replicates each element of a sequence a variable number of times.
;;
;; Use M-x 4clojure-check-answers when you're done!

(= ((fn [coll n]
      (mapcat #(repeat n %) coll))
    [1 2 3] 2) '(1 1 2 2 3 3))

(= ((fn [coll n]
      (mapcat #(repeat n %) coll)) [:a :b] 4) '(:a :a :a :a :b :b :b :b))

(= ((fn [coll n]
      (mapcat #(repeat n %) coll)) [4 5 6] 1) '(4 5 6))

(= ((fn [coll n]
      (mapcat #(repeat n %) coll)) [[1 2] [3 4]] 2) '([1 2] [1 2] [3 4] [3 4]))

(= ((fn [coll n]
      (mapcat #(repeat n %) coll)) [44 33] 2) [44 44 33 33])
