class RecentCounter() {
     val q = ArrayDeque<Int>()
    fun ping(t: Int): Int {
        q.add(t)
        while(q.isNotEmpty() && q.first() < t-3000) 
            q.removeFirst()
        
        return q.size      
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * var obj = RecentCounter()
 * var param_1 = obj.ping(t)
 */