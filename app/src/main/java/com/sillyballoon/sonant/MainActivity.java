package com.sillyballoon.sonant;

import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

//adding importcode
//done adding importcode


/*
*********************************************
*********************************************
This is the original code from android studio template
*********************************************
*********************************************
*/

    public class MainActivity extends AppCompatActivity
    implements NavigationView.OnNavigationItemSelectedListener {
//More recording shit
//        MediaRecorder recorder;
//        File audiofile = null;
//        private static final String TAG = "SoundRecordingActivity";
//        private View startButton;
//        private View stopButton;
//        private View startButton2;
//        private View stopButton2;


        //declare soundpool ids
        SoundPool btnsound, btnsound2, btnsound3;
        int btnsoundID;
        //  SoundPool btnsound2;
        int btnsoundID2;
        //  SoundPool btnsound3;
        int btnsoundID3;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
            setSupportActionBar(toolbar);

            FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
            fab.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Snackbar.make(view, "MAKE A STINKY POOP!!", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                }
            });

            DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
            ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                    this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
            drawer.setDrawerListener(toggle);
            toggle.syncState();

            NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
            navigationView.setNavigationItemSelectedListener(this);



///////////////play sounds
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                AudioAttributes AudioAttr = new AudioAttributes.Builder()
                        .setContentType(AudioAttributes.CONTENT_TYPE_MUSIC)
                        .setUsage(AudioAttributes.USAGE_MEDIA).build();
                btnsound = new SoundPool.Builder().setMaxStreams(10).build();
                btnsound2 = new SoundPool.Builder().setMaxStreams(10).build();
                btnsound3 = new SoundPool.Builder().setMaxStreams(10).build();
                btnsoundID = btnsound.load(this, R.raw.littlebigsounds, 1);
                btnsoundID2 = btnsound2.load(this, R.raw.ryding, 1);
                btnsoundID3 = btnsound3.load(this, R.raw.tails, 1);
            } else {
                btnsound = new SoundPool(10, AudioManager.STREAM_MUSIC, 1);
                btnsound2 = new SoundPool(10, AudioManager.STREAM_MUSIC, 1);
                btnsound3 = new SoundPool(10, AudioManager.STREAM_MUSIC, 1);
                btnsoundID = btnsound.load(this, R.raw.littlebigsounds, 1);
                btnsoundID2 = btnsound2.load(this, R.raw.tails, 1);
                btnsoundID3 = btnsound3.load(this, R.raw.ryding, 1);
            }
        }






        public void playsnd_c1s1(View view) {
            btnsound.play(btnsoundID, 1, 1, 1, 0, 1);
        }

        public void playsnd_c1s2(View view) {
            btnsound2.play(btnsoundID2, 1, 1, 1, 0, 1);
        }

        public void playsnd_c1s3(View view) {
            btnsound3.play(btnsoundID3, 1, 1, 1, 0, 1);
        }

        @Override
        public void onBackPressed() {
            DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
            if (drawer.isDrawerOpen(GravityCompat.START)) {
                drawer.closeDrawer(GravityCompat.START);
            } else {
                super.onBackPressed();
            }
        }

        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            // Inflate the menu; this adds items to the action bar if it is present.
            getMenuInflater().inflate(R.menu.main, menu);
            return true;
        }

        @Override
        public boolean onOptionsItemSelected(MenuItem item) {
            // Handle action bar item clicks here. The action bar will
            // automatically handle clicks on the Home/Up button, so long
            // as you specify a parent activity in AndroidManifest.xml.
            int id = item.getItemId();

            //noinspection SimplifiableIfStatement
            if (id == R.id.action_settings) {
                return true;
            }

            return super.onOptionsItemSelected(item);
        }

        @SuppressWarnings("StatementWithEmptyBody")
        @Override
        public boolean onNavigationItemSelected(MenuItem item) {
            // Handle navigation view item clicks here.
            int id = item.getItemId();

            if (id == R.id.nav_camera) {
                // Handle the camera action
            } else if (id == R.id.nav_gallery) {

            } else if (id == R.id.nav_slideshow) {

            } else if (id == R.id.nav_manage) {

            } else if (id == R.id.nav_share) {

            } else if (id == R.id.nav_send) {

            }

            DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
            drawer.closeDrawer(GravityCompat.START);
            return true;
        }
    }


/*
!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
Sams sound code
!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
*/

//declare sound files
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
//            AudioAttributes AudioAttr = new AudioAttributes.Builder()
//                    .setContentType(AudioAttributes.CONTENT_TYPE_MUSIC)
//                    .setUsage(AudioAttributes.USAGE_MEDIA).build();
//            btnsound = new SoundPool.Builder().setMaxStreams(10).build();
//            btnsound2 = new SoundPool.Builder().setMaxStreams(10).build();
//            btnsound3 = new SoundPool.Builder().setMaxStreams(10).build();
//            btnsoundID = btnsound.load(this, R.raw.littlebigsounds, 1);
//            btnsoundID2 = btnsound2.load(this, R.raw.ryding, 1);
//            btnsoundID3 = btnsound3.load(this, R.raw.tails, 1);
//        }
//        else{
//            btnsound = new SoundPool(10, AudioManager.STREAM_MUSIC,1);
//            btnsound2 = new SoundPool(10, AudioManager.STREAM_MUSIC,1);
//            btnsound3 = new SoundPool(10, AudioManager.STREAM_MUSIC,1);
//            btnsoundID = btnsound.load(this,R.raw.littlebigsounds,1);
//            btnsoundID2 = btnsound2.load(this, R.raw.tails, 1);
//            btnsoundID3 = btnsound3.load(this,R.raw.ryding,1);
//        }
//for recording?
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//        startButton = findViewById(R.id.start);
//        stopButton = findViewById(R.id.stop);
//        startButton2 = findViewById(R.id.fab_startrecording);
//        stopButton2 = findViewById(R.id.fab_stoprecording);
//    }



//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//
//
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }

///////////////////////////////////////record sounds

//    public void startRecording(View view) throws IOException {
//
//        startButton.setEnabled(false);
//        stopButton.setEnabled(true);
//        startButton2.setEnabled(false);
//        stopButton2.setEnabled(true);
//
//
//
//
//
//
//        File sampleDir = Environment.getExternalStorageDirectory();
//        try {
//            audiofile = File.createTempFile("sound", ".3gp", sampleDir);
//        } catch (IOException e) {
//            Log.e(TAG, "sdcard access error",e);
//            return;
//        }
//        recorder = new MediaRecorder();
//        recorder.setAudioSource(MediaRecorder.AudioSource.MIC);
//        recorder.setOutputFormat(MediaRecorder.OutputFormat.THREE_GPP);
//        recorder.setAudioEncoder(MediaRecorder.AudioEncoder.AMR_NB);
//        recorder.setOutputFile(audiofile.getAbsolutePath());
//        recorder.prepare();
//        recorder.start();
//    }
//
//    public void stopRecording(View view) {
//        startButton.setEnabled(true);
//        stopButton.setEnabled(false);
//        startButton2.setEnabled(true);
//        stopButton2.setEnabled(false);
//        recorder.stop();
//        recorder.release();
//        addRecordingToMediaLibrary();
//    }
//
//    protected void addRecordingToMediaLibrary() {
//        ContentValues values = new ContentValues(4);
//        long current = System.currentTimeMillis();
//        values.put(MediaStore.Audio.Media.TITLE, "audio" + audiofile.getName());
//        values.put(MediaStore.Audio.Media.DATE_ADDED, (int) (current / 1000));
//        values.put(MediaStore.Audio.Media.MIME_TYPE, "audio/3gpp");
//        values.put(MediaStore.Audio.Media.DATA, audiofile.getAbsolutePath());
//        ContentResolver contentResolver = getContentResolver();
//
//        Uri base = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
//        Uri newUri = contentResolver.insert(base, values);
//
//        sendBroadcast(new Intent(Intent.ACTION_MEDIA_SCANNER_SCAN_FILE, newUri));
//        Toast.makeText(this, "Added File " + newUri, Toast.LENGTH_LONG).show();
//    }
//}















