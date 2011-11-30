(def c 
	(.toCharArray
		 (str 
			(reduce 
				* 
				(range 1 101)))))

(defn find-it [] 
	"Find the sum of the digits in the number 100!"
	(reduce + 
		(map 
			#(Integer/valueOf 
				(str %)) 
			c)))