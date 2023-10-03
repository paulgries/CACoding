# Clean Architecture

## Preamble

This is a 2-week coding exercise.

You will extend the Clean Architecture implementation to add a use case. It is a
continuation of this code: https://github.com/paulgries/LoginCleanArchitecture

We have:

* implemented the changes from this week's lab
* added the login use case
* added a "logged in" View and View Model (showing the username), but no
  Interactor or Controller or Presenter.
* created subpackages for the `login`, `signup`, and `logged_in` code 
* made some style and design change to the code

To explore the changes, run "git log" in a Terminal, or choose menu item `Git —>
Show Git Log`. Click and explore! You can even watch this README evolve.

## Packaging

Take a moment to look at the package structure in `src`. There are packages for
the layers of CA, and in some of these packages are "subpackages" for each of the
three use cases, `login`, `signup`, and `logged_in`.

These packages don't have subpackages: `data_access`, `entity`, `view`, and
`app`.

**Thought question:** Why don't these have use-case-specific subpackages?

## A note on English: 2-word verb phrases vs. 1-word nouns

"Sign up" is a verb phrase and "signup" is a noun. That generalizes: "check in"
vs "checkin", "log in" vs "login". Two words for the verb phrase, 1 word for the
noun phrase.

For example, to complete a login, you need to log in.

In "the login process", "login" is a noun acting as an adjective to describe
"process". "Basketball coach" is another example of this English construct.

## Comparing the signup and login code

In lab this week, you worked with a single user interaction. We have added a
second use case for login. Let's compare the two use cases.

### Controllers

In IntelliJ, right-click on `LoginController` and select `Open in Right
Split`.

Now double-click on `SignupController`. When you do, you will see the two
Controllers side by side. They are identical in structure, differing only in the
details.

### Interactors

Now compare `LoginInteractor` and `SignupInteractor` side by side. (You can drag
tabs around if you like.)

**Thought question:** Why doesn't the `LoginInteractor` have a `UserFactory`?

#### Remnants of a bug

Compare the two `execute` methods carefully. Look at the variable types
(including the instance variables) and compare them to the CA Engine so you
understand which boxes are relevant to the Interactors.

You'll notice that the `LoginInteractor` starts by extracting
the login information from the Input Data object, and that on line 22 the code
also gets the password before doing the comparison. In the Signup version, it's
all done in one step.

The Login code was split up like this because there was a bug and it wasn't
obvious what was causing it, even when we used the debugger. We isolated the bug
(meaning, we found out what the problem was) by doing one step at a time.

**Thought question:** Which version do you find easier to understand, the Signup
one or the Login one?

**Thought question:** Maybe the problem is with the debugging tools, maybe the
IDE doesn't allow easy exploration of expressions?

### Interactor assets

Each Interactor has an InputBoundary, InputData, OutputBoundary, and
OutpuData. They're all quite short. Compare them.

## Data Access Object

There is only one DAO, the `FileUserDataAccessObject`. It has changed since the
lab: it has one more method. This is because it implements an interface,
`LoginUserDataAccessInterface`.

**Thought question:** What is the method that was added?

## Adding a use case interaction [for credit]

There is currently no way to delete users from the system.

This week's coding exercise has you add a "delete all users" button to the
Signup screen and implement the logic for it.

Look for "TODO" in the `SignupView` class and follow the instructions.

Next, look at the empty classes and interfaces in the "clear_users" packages.
Fill them in!

For this use case interaction, there is no data to give to the
`ClearController`, and no data to put into `ClearInputData`.

**Thought question:**  You need that Controller for CA, but do you need the
InputData object?

Make a decision either way and implement your decision. There
is no wrong choice.

**See MarkUs for details about what you are expected to hand in.**

## Extra Practice

You likely noticed that other features of the program aren't working yet either.
For example:
- the `Log out` button doesn't work once a user logs in
- the `Cancel` buttons don't actually cancel anything
- the program isn't doing some expected checks for password length or username requirements
- the program doesn't have an overall menu to choose between signing up and logging in
- and many more!

If you feel you need more practice with Clean Architecture before getting started on
the project with your team, we encourage you to try adding some of these other bits
of functionality to this program.
