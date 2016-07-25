# twitter-embed-issue

When navigating to `localhost:8000` a twitter widget is displayed (embed code from[here](https://publish.twitter.com)).

By clicking the "Toggle twitter" button a if-tpl displays a different div. This is simulating a tab change in our app.

When the button is clicked again the twitter widget does not reload.

Calling
```
twttr.widgets.load();
```
in the web browser console will not reload the widget.

However removing the `data-twitter-extracted-i******************="true"` attribute manually from the anchor and then calling
```
twttr.widgets.load();
```
will reinitialise the widget.

## Dependencies

- java 1.7+
- [boot][1]

## Usage
### Development
1. Start the `dev` task. In a terminal run:
    ```bash
    $ boot dev
    ```
2. Go to [http://localhost:8000][2] in your browser. You should see a twitter widget.

3. Click the button "Toggle twitter" to show different content.

4. Click again to show the twitter widget but this time it does not display.

## License

Copyright © 2016, **Exicon**

[1]: http://boot-clj.com
[2]: http://localhost:8000
[3]: http://hoplon.io
