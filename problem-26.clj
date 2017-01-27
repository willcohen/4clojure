;; 4Clojure Question 26
;;
;; Write a function which returns the first X fibonacci numbers.
;;
;; Use M-x 4clojure-check-answers when you're done!

(= ((fn [x]
      (loop [a 1 b 1 summed [1]]
        (if (>= (count summed) x)
          summed
          (recur b (+ a b) (conj summed b))))) 3) '(1 1 2))

(= ((fn [x]
      (loop [a 1 b 1 summed [1]]
        (if (>= (count summed) x)
          summed
          (recur b (+ a b) (conj summed b))))) 6) '(1 1 2 3 5 8))

(= ((fn [x]
      (loop [a 1 b 1 summed [1]]
        (if (>= (count summed) x)
          summed
          (recur b (+ a b) (conj summed b))))) 8) '(1 1 2 3 5 8 13 21))
