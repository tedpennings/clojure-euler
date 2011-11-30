(defn fizzbuzz []
	(loop [x 1]
		(print (str x " "))
		(if (zero? (mod x 3))
		    (print "Fizz"))
		(if (zero? (mod x 5))
		    (print "Buzz"))
		(println) ;only line break printed
		(if (< x 100)
			(recur (inc x)))))