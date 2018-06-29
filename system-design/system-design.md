## System Design

Scalability
===========

[Scalability Lecture at Harvard](http://cs75.tv/2012/summer/)
-------------------------------------------------------------

* [Video](https://www.youtube.com/watch?v=-W9F__D3oY4)
* Topics Covered
    - What is Web Hosting?
    - Types of Web Hosting
        + Shared Hosting
        + Virtual Private Server (VPS)
        + Physical Server
    - What is Vertical Scaling?
    - What is Horizontal Scaling?
    - What is the role of Load Balancer?
    - What are different techniques to balance load?
    - What are dedicated servers?
    - How would you implement Shared Storage for sticky sessions?
    - How would you use cookies for sticky sessions?
    - Give examples for Software and Hardware Load Balancers
    - PHP Accelerators
    - What are different caching techniques?
        + Generating static html files
        + MySql Query Cache
        + memcached
    - What is Replication?
    - What is Partitioning?
    - Design a topology with Load balancing + Replication + Partitioning 


Scalibility Article
-------------------

* Topics Covered
    - [Clones](http://www.lecloud.net/post/7295452622/scalability-for-dummies-part-1-clones)
    - [Databases](http://www.lecloud.net/post/7994751381/scalability-for-dummies-part-2-database)
    - [Caches](http://www.lecloud.net/post/9246290032/scalability-for-dummies-part-3-cache)
    - [Asynchronism](http://www.lecloud.net/post/9699762917/scalability-for-dummies-part-4-asynchronism)


Performance vs Scalability
==========================
A service is scalable if it results in increased performance in a manner proportional to resources added. Generally, increasing performance means serving more units of work, but it can also be to handle larger units of work, such as when datasets grow.

Another way to look at performance vs scalability:
* If you have a performance problem, your system is slow for a single user.
* If you have a scalability problem, your system is fast for a single user but slow under heavy load.

**Source(s) and Further Reading**
* [A Word on Scalability](http://www.allthingsdistributed.com/2006/03/a_word_on_scalability.html)
* [Scalability, Availability and Stability Patterns](https://www.slideshare.net/jboner/scalability-availability-stability-patterns/)


CAP Theorem
===========
* [CAP Theorem for distributed system](http://ksat.me/a-plain-english-introduction-to-cap-theorem/)

System Design Basics
====================
* [Vertical Scaling]
* [Horizontal Scaling]
* [Load Balancing]
* [Caching]
* [Sharding or Data Partitioning]
* [Indexes]
* [Proxies]
* [Queues]
* [Redundancy and Replication]
* [SQL vs NoSQL]
* [CAP Theorem]
* [Consistent Hashing]
* [Long Polling vs Web Sockets vs Server-Sent Events]


System Design Examples
======================

* [Design Cache](examples/design-cache.md)
* [Sharding a Database](examples/sharding-a-database.md)
* [Highly Available Database](examples/highly-available-database.md)
* [Highly Consistent Database](examples/highly-consistent-database.md)
* [Design URL Shortener](examples/design-url-shortener.md)
* [Design Search Typeahead](examples/design-search-typeahead.md)
* [Design Messenger](examples/design-messenger.md)
* [Design Twitter](examples/design-twitter.md)
* [Design Pastebin]
* [Design Instagram]
* [Design Dropbox]
* [Design Youtube or Netflix]
* [Design an API Rate Limiter]
* [Design Twitter Search]
* [Design Web Crawler]
* [Design Facebook Newsfeed]
* [Design Yelp or Nearby Friends]
* [Design Uber Backend]
* [Design BookMyShow]


References
==========

* [System Design Primer by Donne Martin](https://github.com/donnemartin/system-design-primer)
* [Scalability Lecture at Harvard](https://www.youtube.com/watch?v=-W9F__D3oY4)
* [CAP Theorem for distributed system](http://ksat.me/a-plain-english-introduction-to-cap-theorem/)
* [High Scalability Blog on System Design](http://highscalability.com/)
* [High Scalability - All time favorites](http://highscalability.com/all-time-favorites/)
* [System Design Cheatsheet](https://gist.github.com/vasanthk/485d1c25737e8e72759f)
* [Grokking the System Design Interview](https://www.educative.io/collection/page/5668639101419520/5649050225344512/5747976207073280)
* [System Design Course - HiredInTech](https://www.hiredintech.com/classrooms/system-design/lesson/52)
* [System Design - Youtube Channel](https://www.youtube.com/playlist?list=PLrmLmBdmIlps7GJJWW9I7N0P0rB0C3eY2)
* [System Design - Success In Tech Youtube](https://www.youtube.com/channel/UC-vYrOAmtrx9sBzJAf3x_xw)
* [Scalability for Dummies](http://www.lecloud.net/post/7295452622/scalability-for-dummies-part-1-clones)
* [A Word on Scalability](http://www.allthingsdistributed.com/2006/03/a_word_on_scalability.html)
* [Scalability, Availability and Stability Patterns](https://www.slideshare.net/jboner/scalability-availability-stability-patterns/)
* [Master Slave in Databases - Quora](https://www.quora.com/What-are-Master-and-Slave-databases-and-how-does-pairing-them-make-web-apps-faster)
* [Sharding Pinterest](https://medium.com/@Pinterest_Engineering/sharding-pinterest-how-we-scaled-our-mysql-fleet-3f341e96ca6f)
* [Latency Numbers Every Programmer Should Know](https://gist.github.com/jboner/2841832)
* [Latency Numbers Everyone Should Know - HighScalibility](http://highscalability.com/numbers-everyone-should-know)
* [System Design Interviews Github Repo](https://github.com/shashank88/system_design#designques)


