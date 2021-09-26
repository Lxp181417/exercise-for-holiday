# shoppingManage
注意：相关功能（一些很具体的要求）没有全部实现，并且有一些BUG，但是满足了基本要求
//Note: The functionality (some very specific requirements) is not fully implemented and there are a few bugs, but the basic requirements are met.

      The administrator functions and requirements are described as follows:
(1) to log in
The administrator account can be set as admin and the password is ynuinfo#777.
(2) Password management
(2.1) Change your password
Example Change the password of the administrator.
(2.2) Resets the password of a specified customer/user
The administrator can reset the password of a common user but cannot view the password of a common user.
(3) Customer management
(3.1) List all customer information:
Customer information includes: customer ID, user name, user level (gold customer, silver customer, bronze customer), user registration time, customer's total accumulative consumption amount, user's mobile phone number, user's email address;
(3.2) Deleting customer Information:
Before deleting customer information, prompt users to confirm whether to continue deleting customer information.
(3.3) Querying customer information
You can query information by customer ID or user name, or query information about all customers at a time.
(4) Commodity management
(4.1) List the information of all commodities
Commodity information includes: commodity number, commodity name, manufacturer, date of production, model, purchase price, retail price and quantity.
(4.2) Add commodity information
Commodity information includes: commodity number, commodity name, manufacturer, date of production, model, purchase price, retail price and quantity.
(4.3) Modify commodity information
The above commodity information can be modified.
(4.4) Delete commodity information
Products can be deleted. Before deletion, a warning message must be given: the deletion cannot be restored. Please confirm whether to continue the deletion operation.
(4.5) Query commodity information
Can be based on the name of the commodity, manufacturer, retail price for individual query or combination query (for example: query Lenovo, more than 1000 commodity list).
(5) Log out
Log out as an administrator.

     Customer's functions and requirements are described as follows:
(1) registration:
The user name must contain at least 5 characters. The password contains at least eight characters and must be a combination of uppercase and lowercase letters, digits, and punctuation marks.
(2) Login: The account will be locked if you enter the wrong password for five consecutive times.
(3) Password management
(3.1) Change your password
The password contains at least eight characters and must be a combination of uppercase and lowercase letters, digits, and punctuation marks.
(3.2) Forget password: you can reset the password by yourself
Simulate the reset password function, when the user chooses to forget the password function, let the user input the user name and register the email address used, the system will send a randomly generated password to the specified mailbox. The user is prompted to log in with this password.
(4) shopping
(4.1) Add goods to the shopping cart
The user can enter the item number and quantity to add the specified item to the shopping cart.
(4.2) Remove the item from the cart
Items can be removed from the shopping cart, before removing, a warning must be given: please confirm whether to continue to remove the operation. The removal does not affect the number of items.
(4.3) Modify the items in the shopping cart
Modifies the quantity of an item so that when the quantity is less than or equal to zero, the item is removed from the cart.
(4.4) Checkout (simulated payment channels: Alipay, wechat and bank cards)
Simulate payment operation, do not call the actual Alipay, wechat, bank card. It just shows that the relevant operation has been carried out, and after the success of the operation, the corresponding quantity of goods in the system should be modified.
(4.5) Viewing the Shopping History
View the user's shopping history: time, list of items purchased.
(5) Log out
Log out.
