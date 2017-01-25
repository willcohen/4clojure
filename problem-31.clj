;; 4Clojure Question 31
;;
;; Write a function which packs consecutive duplicates into sub-lists.
;;
;; Use M-x 4clojure-check-answers when you're done!

(= ((fn [x] (partition-by identity x)) [1 1 2 1 1 1 3 3]) '((1 1) (2) (1 1 1) (3 3)))

(= ((fn [x] (partition-by identity x)) [:a :a :b :b :c]) '((:a :a) (:b :b) (:c)))

(= ((fn [x] (partition-by identity x)) [[1 2] [1 2] [3 4]]) '(([1 2] [1 2]) ([3 4])))
