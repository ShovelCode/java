@GetMapping("/hello")
public ResponseEntity<String> hello() {
    return new ResponseEntity<>("Hello, World!", HttpStatus.OK);
}
