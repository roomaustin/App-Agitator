@Override
protected void onStop() {
    super.onStop();
    // Do something agitating here, for example, vibrate the phone
    Vibrator v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
    if (v != null) {
        // Vibrate for 500 milliseconds
        v.vibrate(500);
    }
}
