(defn palindrome? [x]
	"Returns true iff x is a palindrome"
	(let [c (str x)]
		(= 
			(seq c) 
			(reverse c))))
	
(def numbers (range 101 1000))
	
(defn palindromes []
	(let [palindromes (ref (sorted-set))]
		(dosync
			(doseq [x numbers]
				(doseq [y numbers]
					(let [candidate (* x y)]
						(if (palindrome? candidate)
							(ref-set palindromes (conj @palindromes candidate)))))))
		@palindromes))
		
(defn find-it []
	"Find the largest palindrome made from the product of two 3-digit numbers."
	(let [palindromes (palindromes)]
		(first (reverse palindromes))))