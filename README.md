# Assignment2_idata2305_moreGroups1
moregroups1 assignment 2 for operating system

# Movie Ticket Booking System

## Overview
This project is a simple multithreaded Java application that simulates a movie ticket booking system. The system consists of a `MovieTicketServer` that handles ticket bookings and multiple `MovieTicketClient` instances that request tickets concurrently.

## How to Run the Code

Using an IDE, open the project and run the `Main` class.

## Report

We saw that available tickets went down as expected, when it was non synchronized it was first come first serve, so that thread 4 3 and 2 can go before thread 1, this didn’t change when using volatile on the total available tickets, as it means that it just means every thread has access to the updated value of the available tickets, when changing server to synchronized however we see that they access updated values, and that only the last call that is printed is the one that goes no tickets left. Example:

Xiangmingi ordered 3
Booked: 7this amount of tickets left
Ilariai ordered 2
Booked: 5this amount of tickets left
Sami ordered 3
Booked: 2this amount of tickets left
Andreasi ordered 4
Not enough tickets
So you see not enough tickets last


Under you see run without volatile or synchronized:
```
Xiangmingi ordered 3 

Sami ordered 3

Andreasi ordered 4

Ilariai ordered 2

Not enough tickets

Booked: 7this amount of tickets left

Booked: 0this amount of tickets left
```

You see that it writes that all get to order even though we know this is not the case, because the volatile isn't used on total tickets so other threads don't see the update value.


