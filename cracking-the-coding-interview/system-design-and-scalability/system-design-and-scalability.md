## System Design and Scalability

### 9.1 Stock Data
Imagine you are building some sort of service that will be called by upto 1,000 client applications to get simple end-of-day stock price information (open, close, high, low). You may assume that you already have the data, and you can store it in any format you wish. How would you design the client facing service that provides the information to client applications? You are responsible for the development, rollout, and ongoing monitoring and maintenance of the feed. Describe the different methods you considered and why would you recommend your approach. Your service can use any technologies you wish, and can distribute the information to the client applications in any mechanism you choose.

### 9.2 Social Network
How would you design the data structures for a very large social network like Facebook or LinkedIn? Describe how you would design an algorithm to show the shortest path between two people (e.g., Me -> Bob -> Susan -> Jason -> You)

### 9.3 Web Crawler
If you were designing a web crawler, how would you avoid getting into infinite loops?

### 9.4 Duplicate URLs
You have 10 billion URLs. How do you detect the duplicate documents? In this case assume "duplicate" means that URLs are identical.

### 9.5 Cache
Imagine a web server for simplified search engine. This system has 100 machines to respond to search queries which may then call out using processSearch(string query) to another cluster of machines to actually get the result. The machine which responds to a given query is chosen at random, so you cannot guarantee that the same machine will respond to the same request. The method processSearch is very expensive. Design a caching mechanism for most recent queries. Be sure to explain how you would update the cache when data changes.

### 9.6 Sales Rank
A large e-commerce company wishes to list the best selling products, overall by category. For example, one product might be the #1056th best selling product overall but the #13th best selling product under "Sports Equipment" 
and the #24th best selling product under "Safety". Describe how you would design this system.

### 9.7 Personal Financial Manager
Explain how you would design a personal financial manager (like Mint.com). This system would connect to your bank accounts, analyze your spending habits, and make recommendations.

### 9.8 Pastebin
Design a system like Pastenbon, where user can enter piece of text and get a randomly generated URL to access it.