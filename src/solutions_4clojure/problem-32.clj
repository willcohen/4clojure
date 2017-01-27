;; 4Clojure Question 32
;;
;; Write a function which duplicates each element of a sequence.
;;
;; Use M-x 4clojure-check-answers when you're done!

(= ((fn [x]
      (reduce concat (map #(vector % %) x))) [1 2 3]) '(1 1 2 2 3 3))

(= ((fn [x]
      (reduce concat (map #(vector % %) x))) [:a :a :b :b]) '(:a :a :a :a :b :b :b :b))

(= ((fn [x]
      (reduce concat (map #(vector % %) x))) [[1 2] [3 4]]) '([1 2] [1 2] [3 4] [3 4]))

(= ((fn [x]
      (reduce concat (map #(vector % %) x))) [[1 2] [3 4]]) '([1 2] [1 2] [3 4] [3 4]))
