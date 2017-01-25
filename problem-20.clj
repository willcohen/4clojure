;; 4Clojure Question 20
;;
;; Write a function which returns the second to last element from a sequence.
;;
;; Use M-x 4clojure-check-answers when you're done!

(= ((fn [x] (->> x (reverse) (second))) (list 1 2 3 4 5)) 4)

(= ((fn [x] (->> x (reverse) (second))) ["a" "b" "c"]) "b")

(= ((fn [x] (->> x (reverse) (second))) [[1 2] [3 4]]) [1 2])
