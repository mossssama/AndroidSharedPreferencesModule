# AndroidSharedPreferencesModule
Android Shared Preferences class in Java language + Single UI using some of its methods + picture of it's actual path

# **Usage**
1. **Put [SharedPrefs class](https://github.com/mossssama/AndroidSharedPreferencesModule/blob/main/SharedPrefs/app/src/main/java/com/example/sharedprefs/SharedPrefs.java) in your app folder**
2. **Use the following in the place you want to use SharedPrefs**; substitute the i/p parameters by their equivalent in your project
** **
    // Making an instance of the module
    SharedPrefs sharedPrefs =new SharedPrefs(getApplicationContext(),"sharedPrefsName");
        
    // Writing in sharedPrefs
    sharedPrefs.write("isLoggedIn",false);
    
    
    // Reading from sharedPrefs
    sharedPrefs.readMap("isLoggedIn",false);
- - - - 