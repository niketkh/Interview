## System Design

### Scalability

##### [Scalability Lecture at Harvard](http://cs75.tv/2012/summer/)

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


##### Scalibility Article
* Topics Covered
    - [Clones](http://www.lecloud.net/post/7295452622/scalability-for-dummies-part-1-clones)
    - [Databases](http://www.lecloud.net/post/7994751381/scalability-for-dummies-part-2-database)
    - [Caches](http://www.lecloud.net/post/9246290032/scalability-for-dummies-part-3-cache)
    - [Asynchronism](http://www.lecloud.net/post/9699762917/scalability-for-dummies-part-4-asynchronism)


### Performance vs Scalability
A service is scalable if it results in increased performance in a manner proportional to resources added. Generally, increasing performance means serving more units of work, but it can also be to handle larger units of work, such as when datasets grow.

Another way to look at performance vs scalability:
* If you have a performance problem, your system is slow for a single user.
* If you have a scalability problem, your system is fast for a single user but slow under heavy load.

##### Source(s) and Further Reading
* [A Word on Scalability](http://www.allthingsdistributed.com/2006/03/a_word_on_scalability.html)
* [Scalability, Availability and Stability Patterns](https://www.slideshare.net/jboner/scalability-availability-stability-patterns/)

