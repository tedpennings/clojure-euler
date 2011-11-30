(defn find-it []
	"Adds all the natural numbers below one thousand that are multiples of 3 or 5."
	(let [correct-multiples (fn [x]
		(or (multiple-of-3 x) (multiple-of-5 x)))]
		(let [nums (filter correct-multiples (range 1000))]
			(apply + nums))))
	
(defn multiple-of-3 [x]
	(= 0 (rem x 3)))

(defn multiple-of-5 [x]
	(= 0 (rem x 5)))