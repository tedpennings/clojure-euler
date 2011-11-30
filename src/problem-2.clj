(def fib-seq 
  ((fn rfib [a b] 
     (lazy-seq (cons a (rfib b (+ a b)))))
   0 1))

(defn fib-sum []
	"By considering the terms in the Fibonacci sequence whose values do not exceed 
	 four million, find the sum of the even-valued terms."
     (loop [n 0
	         sum 0]
	   (let [num (nth fib-seq n)]
	     (println (str "Adding " num))
	     (if (< num 4000000)
	       (if (= 0 (rem num 2))
	       	(recur (inc n) sum)
	       	(recur (inc n) (+ sum num)))
	       (println (str "Sum is " sum))))))