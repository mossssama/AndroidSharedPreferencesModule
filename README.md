# AndroidSharedPreferencesModule
Android Shared Preferences class in Java language + Single UI using some of its methods + picture of it's actual path

# **Usage**
***
[1] **Put [SharedPrefs class](https://github.com/mossssama/AndroidSharedPreferencesModule/blob/main/SharedPrefs/app/src/main/java/com/example/sharedprefs/SharedPrefs.java) in your app folder**

***
[2] **Use the following in the place you want to use SharedPrefs**; substitute the i/p parameters by their equivalent in your project

    // Making an instance of the module
    SharedPrefs.init(getContenxt())
    
    /* Used them incase you want to track changes in SharedPrefs */
    // MyPrefsListener myPrefsListener = new MyPrefsListener();
    // SharedPrefs.getSharedPreferences().registerOnSharedPreferenceChangeListener(myPrefsListener);
    /* *************************************************** */
        
    // Writing in sharedPrefs
    SharedPrefs.write(key,value);
    
    
    // Reading from sharedPrefs
    SharedPrefs.readMap(key,value);
    
    // Deleting from sharedPrefs
    SharedPrefs.remove(key);
- - - - 
[3] **Add the following inner class in any Activity/Fragment you want to track a SharedPrefs' key changes in it**

    private class MyPrefsListener implements SharedPreferences.OnSharedPreferenceChangeListener {

            @Override
            public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String key) {
                if (key.equals(keyYouWantToTrackItsChanges)) {
                    if(SharedPrefs.readMap(key, defaultValue))  { /* Do specific Operation */ } 
                    else                                        { /* Do Another Operation */ }   
                }
            }
        }
- - - - 
[4] **Check [this](https://gist.github.com/mossssama/d795986c7aaae11cd5c66b4e1274dbe0) example on Tracking changes In SharedPrefs class**   
- - - - 

## **To Track the actual place of the sharedPrefs xml file**
![Screenshot (760)](https://user-images.githubusercontent.com/92642692/220457185-cf1aafc7-c007-40f1-a81b-38f0e2bdf98f.png)
![Screenshot (761)](https://user-images.githubusercontent.com/92642692/220457191-72ff911e-a7a5-40e3-be5d-3894dfdb8bcc.png)
