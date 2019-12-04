package com.example.mhassan.androidnearbyplaces;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.location.Location;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResponse;
import com.google.android.gms.location.SettingsClient;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback, com.google.android.gms.location.LocationListener, GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {

    private GoogleMap mMap;
    GoogleApiClient mGoogleApiClient;
    //Location location;
    LocationRequest locationReques;
    final int REQUEST_LOCATION_CODE = 99;
    Marker marker;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanc eState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        buildGoogleapiclint();
        // Add a marker in Sydney and move the camera

        //mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));

        mMap.addMarker(new MarkerOptions().position(new LatLng(  30.163649, 31.338332  )).title("New El-Marg").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_subway_black_24dp)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(  30.152149, 31.335554   )).title("El-Marg").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_subway_black_24dp)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(  30.139318, 31.324415 )).title("Ezbt el-Nkhl").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_subway_black_24dp)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(  30.131120, 31.319052  )).title("Ain Shams").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_subway_black_24dp)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(  30.121606, 31.313806   )).title("El-Matareyya").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_subway_black_24dp)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(  30.113389, 31.313960  )).title("Helmiet el-Zaitoun").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_subway_black_24dp)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(  30.105920, 31.310429  )).title("Hadayeq el-Zaitoun").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_subway_black_24dp)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(  30.097799, 31.304540  )).title("Saray el-Qobba").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_subway_black_24dp)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(  30.091237, 31.298932  )).title("Hammamat el-Qobba").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_subway_black_24dp)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(  30.087244, 31.294631  )).title("Kobri el-Qobba").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_subway_black_24dp)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(  30.082060, 31.287469 )).title("Manshiet el-Sadr").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_subway_black_24dp)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(  30.077316, 31.277803 )).title("El-Demerdash").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_subway_black_24dp)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(  30.069048, 31.264617 )).title("Ghamra").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_subway_black_24dp)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(  30.061088, 31.246042 )).title("Al Shohadaa").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_subway_black_24dp)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(  30.056965, 31.242314  )).title("Orabi").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_subway_black_24dp)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(  30.053415, 31.238712 )).title("Nasser").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_subway_black_24dp)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(  30.043582, 31.235269   )).title("Sadat").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_subway_black_24dp)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(  30.037226, 31.238042  )).title("Saad Zaghloul").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_subway_black_24dp)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(  30.029313, 31.235382 )).title("Sayyeda Zeinab").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_subway_black_24dp)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(  30.069048, 31.264617 )).title("El-Malek el-Saleh").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_subway_black_24dp)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(  30.006105, 31.229650 )).title("Mar Girgis").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_subway_black_24dp)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(  29.995509, 31.231171  )).title("El-Zahraaa").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_subway_black_24dp)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(  29.981962, 31.241936 )).title("Dar el-Salam").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_subway_black_24dp)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(  29.970106, 31.250473  )).title("Hadayeq el-Maadi").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_subway_black_24dp)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(  29.960338, 31.257585 )).title("Maadi").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_subway_black_24dp)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(  29.953324, 31.262985  )).title("Sakanat el-Maadi").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_subway_black_24dp)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(  29.946790, 31.272937 )).title("Tora el-Balad").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_subway_black_24dp)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(  29.936383, 31.281338  )).title("Kozzika").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_subway_black_24dp)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(  29.925930, 31.287458 )).title("Tora el-Asmant").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_subway_black_24dp)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(  29.906108, 31.299471  )).title("El-Maasara").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_subway_black_24dp)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(  29.897197, 31.303954 )).title("Hadayeq Helwan").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_subway_black_24dp)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(  29.879089, 31.313421 )).title("Wadi Hof").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_subway_black_24dp)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(  29.869506, 31.320019 )).title("Helwan University").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_subway_black_24dp)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(  29.862629, 31.324877 )).title("Ain Helwan").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_subway_black_24dp)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(  29.849004, 31.334209 )).title("Helwan").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_subway_black_24dp)));
        mMap.addMarker(new MarkerOptions().position(new LatLng( 30.122441, 31.244655 )).title("Shobra").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_subway_black_24dp)));
        mMap.addMarker(new MarkerOptions().position(new LatLng( 30.113832, 31.248788 )).title("Koliet El-Zeraa").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_subway_black_24dp)));
        mMap.addMarker(new MarkerOptions().position(new LatLng( 30.104059, 31.245549 )).title("Mezallat").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_subway_black_24dp)));
        mMap.addMarker(new MarkerOptions().position(new LatLng( 30.097855, 31.245000 )).title("Khalafawy").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_subway_black_24dp)));
        mMap.addMarker(new MarkerOptions().position(new LatLng( 30.087952, 31.245488 )).title("Sainta Teresa").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_subway_black_24dp)));
        mMap.addMarker(new MarkerOptions().position(new LatLng( 30.080642, 31.245446 )).title("Road el-Farag").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_subway_black_24dp)));
        mMap.addMarker(new MarkerOptions().position(new LatLng( 30.070932, 31.245090 )).title("Massara").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_subway_black_24dp)));
        mMap.addMarker(new MarkerOptions().position(new LatLng( 30.052449, 31.246810 )).title("Ataba").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_subway_black_24dp)));
        mMap.addMarker(new MarkerOptions().position(new LatLng( 30.045414, 31.244184 )).title("Naguib").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_subway_black_24dp)));
        mMap.addMarker(new MarkerOptions().position(new LatLng( 30.042192, 31.224958 )).title("Opera").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_subway_black_24dp)));
        mMap.addMarker(new MarkerOptions().position(new LatLng( 30.038639, 31.212733 )).title("Dokki").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_subway_black_24dp)));
        mMap.addMarker(new MarkerOptions().position(new LatLng( 30.035872, 31.200150 )).title("Bohooth").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_subway_black_24dp)));
        mMap.addMarker(new MarkerOptions().position(new LatLng( 30.026045, 31.201100 )).title("Cairo University").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_subway_black_24dp)));
        mMap.addMarker(new MarkerOptions().position(new LatLng( 30.017376, 31.203946 )).title("Faisal").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_subway_black_24dp)));
        mMap.addMarker(new MarkerOptions().position(new LatLng( 30.010743, 31.207068 )).title("Giza").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_subway_black_24dp)));
        mMap.addMarker(new MarkerOptions().position(new LatLng( 30.005493, 31.207905 )).title("Giza Suburbs").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_subway_black_24dp)));
        mMap.addMarker(new MarkerOptions().position(new LatLng( 29.995488, 31.208643 )).title("Sakiat Mekki").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_subway_black_24dp)));
        mMap.addMarker(new MarkerOptions().position(new LatLng( 29.981064, 31.212334 )).title("El Mounib").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_subway_black_24dp)));
        mMap.addMarker(new MarkerOptions().position(new LatLng( 30.091786, 31.326319 )).title("Al-Ahram").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_subway_black_24dp)));
        mMap.addMarker(new MarkerOptions().position(new LatLng( 30.083968, 31.328970 )).title("Koleyet El-Banat").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_subway_black_24dp)));
        mMap.addMarker(new MarkerOptions().position(new LatLng( 30.073187, 31.318083 )).title("Stadium").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_subway_black_24dp)));
        mMap.addMarker(new MarkerOptions().position(new LatLng( 30.073333, 31.300981 )).title("Cairo Fair Zone").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_subway_black_24dp)));
        mMap.addMarker(new MarkerOptions().position(new LatLng( 30.072501, 31.283816 )).title("Abbasiya").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_subway_black_24dp)));
        mMap.addMarker(new MarkerOptions().position(new LatLng( 30.064849, 31.274780 )).title("Abdo Pasha").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_subway_black_24dp)));
        mMap.addMarker(new MarkerOptions().position(new LatLng( 30.061869, 31.266855 )).title("El Geish").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_subway_black_24dp)));
        mMap.addMarker(new MarkerOptions().position(new LatLng( 30.053989, 31.255966 )).title("Bab El-Shareya").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_subway_black_24dp)));



    }




    @Override
    public void onConnected(@Nullable Bundle bundle) {
        locationReques = new LocationRequest();
        locationReques.setSmallestDisplacement(10);
        locationReques.setFastestInterval(10000);
        locationReques.setPriority(LocationRequest.PRIORITY_HIGH_ACCURACY);
        int permissionCheck = ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION);
        if (permissionCheck == PackageManager.PERMISSION_GRANTED) {
            LocationServices.FusedLocationApi.requestLocationUpdates(mGoogleApiClient, locationReques, this);
            LocationSettingsRequest.Builder builder = new LocationSettingsRequest.Builder()
                    .addLocationRequest(locationReques);
            SettingsClient client = LocationServices.getSettingsClient(this);
            Task<LocationSettingsResponse> task = client.checkLocationSettings(builder.build());
            task.addOnFailureListener(this, new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {
                    if (e instanceof ResolvableApiException) {
                        try {
                            ResolvableApiException resolvable = (ResolvableApiException) e;
                            resolvable.startResolutionForResult(MapsActivity.this,
                                    REQUEST_LOCATION_CODE);
                        } catch (IntentSender.SendIntentException sendEx) {
                        }
                    }
                }
            });
        }
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
        }
    }

    @Override
    public void onConnectionSuspended(int i) {

    }

    @Override
    public void onConnectionFailed(@NonNull ConnectionResult connectionResult) {

    }

    @Override
    public void onLocationChanged(Location location) {
        if(marker!=null){
            marker.remove();
        }
        Cameraposition(location.getLatitude(), location.getLongitude());
        LatLng myLocation = new LatLng(location.getLatitude(), location.getLongitude());
       //ايه الفرق بين

       marker=mMap.addMarker(new MarkerOptions().position(myLocation).title("Location"));

    }

    private synchronized void buildGoogleapiclint() {
        mGoogleApiClient = new GoogleApiClient.Builder(this)
                .addConnectionCallbacks(this)
                .addOnConnectionFailedListener(this)
                .addApi(LocationServices.API)
                .build();
        mGoogleApiClient.connect();
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {

        switch (requestCode) {
            case REQUEST_LOCATION_CODE:
                switch (resultCode) {
                    case Activity.RESULT_OK:
                        buildGoogleapiclint();
                        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
                            return;
                        }

                        break;
                    case Activity.RESULT_CANCELED:
                        break;
                    default:
                        break;
                }

                break;
        }
    }

    public void Cameraposition(double latiI, double longeE) {
        mMap.getUiSettings().setMyLocationButtonEnabled(true);
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            return;
        }
        mMap.setMyLocationEnabled(true);

        CameraPosition currentPlace = new CameraPosition.Builder()
                .target(new LatLng(latiI, longeE))
                .bearing(240).tilt(30).zoom(15f).build();
        mMap.moveCamera(CameraUpdateFactory.newCameraPosition(currentPlace));
    }
}
