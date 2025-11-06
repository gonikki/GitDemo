export function generateRandomUser() {
  const random = Math.floor(Math.random() * 100000);
  return {
    username: `user${random}`,
    email: `user${random}@test.com`,
    password: 'Test@1234'
  };
}
