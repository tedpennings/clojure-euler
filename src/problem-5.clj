(defn divisible-by [x numbers]
	(empty? (filter false? (map #(= 0 (rem x %)) numbers))))

(defn find-it []
	"What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?"
	(let [nums-to-test (range 1 21)]
		(loop [x 1]
			(if (divisible-by x nums-to-test)
			  (println "The smallest number is " x)
			  (recur (inc x))))))