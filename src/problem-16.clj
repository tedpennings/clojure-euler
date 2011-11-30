(defn power [base exponent]
	"Computes base^exponent"
	(loop [product 1 e 1]
		(if (>= exponent e)
			(recur (* base product) (inc e))
			product)))
			
(defn new-int [^String x] 
	(Integer. x))			

(defn find-it []
	(apply +
		(map new-int 
			(map str (seq (str (power 2 1000)))))))