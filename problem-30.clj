;; 4Clojure Question 30
;;
;; Write a function which removes consecutive duplicates from a sequence.
;;
;; Use M-x 4clojure-check-answers when you're done!

(= (apply str ((fn [x] (map first (partition-by identity x))) "Leeeeeerrroyyy")) "Leroy")

(= ((fn [x] (map first (partition-by identity x))) [1 1 2 3 3 2 2 3]) '(1 2 3 2 3))

(= ((fn [x] (map first (partition-by identity x))) [[1 2] [1 2] [3 4] [1 2]]) '([1 2] [3 4] [1 2]))
