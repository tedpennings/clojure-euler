(defn fizzbuzz []
	(loop [x 1]
		(prn x)
		(if (= 0 (rem x 3))
		    (prn "Fizz"))
		(if (= 0 (rem x 5))
		    (prn "Buzz"))
		(println)
		(if (< x 100)
			(recur (inc x)))))