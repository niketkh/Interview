## Design Search Typeahead

<img src="../images/design-search-typeahead-1.png" alt="">

Features
========

> How many typeahead suggestions is to be provided?

> Do we need to account for spelling mistakes?

> What is the criteria for choosing 5 suggestions?

> Does the system need to be realtime ( For example, recent popular events like “Germany wins the FIFA worldcup” starts showing up in results within minutes ).

> Do we need to support personalization with the suggestions? ( My interests / queries affect the search suggestions shown to me).

<img src="../images/design-search-typeahead-2.png" alt="">


Estimation
==========

> How many search queries are done per day?

> How many queries per second should the system handle?

> How much data would we need to store?

<img src="../images/design-search-typeahead-3.png" alt="">


Design Goals
=============

> Is Latency a very important metric for us?

> How important is Consistency for us?

> How important is Availability for us?

<img src="../images/design-search-typeahead-4.png" alt="">


Skeleton of Design
==================

> What would the API look like for client?

> What is a good data structure to store my search queries so that I can quickly retrieve the top 5 most popular queries?

> How would a typical read query look like?

> How would a typical write query look like?

<img src="../images/design-search-typeahead-5.png" alt="">


Deep Dive
=========

> How would you take care of application layer fault tolerance?

> How do we handle the case where our application server dies?

> How does our client know which application servers to talk to. How does it know which application servers have gone down and which ones are still working?

<img src="../images/design-search-typeahead-6.png" alt="">

> How would a read query on the trie work?

> How can we modify the trie so that reads become super efficient?

> How would a typical write work in this trie?

> Can frequent writes affect read efficiency?

<img src="../images/design-search-typeahead-7.png" alt="">

> What optimizations can we do to improve read efficiency?

> Can we use sampling?

> Offline update?

> What if I use a separate trie for updates and copy it over to the active one periodically?

<img src="../images/design-search-typeahead-8.png" alt="">

> Would all data fit on a single machine?

> Alright, how do we shard the data then?

> Would we only shard on the first level?

> What is the downside of assigning one branch to a different shard?

> How would we handle a DB machine going down?

<img src="../images/design-search-typeahead-9.png" alt="">


References
===========
* Lookup Trie