(def numbers (range 1 101))

(defn square [x]
	(* x x))

(defn find-it []
	"Find the difference between the sum of the squares of the 
	 first one hundred natural numbers and the square of the sum."
	(let [square-of-sums  (square (reduce + numbers))
	      sum-of-squares  (reduce + (map square numbers))]
		(- square-of-sums sum-of-squares)))