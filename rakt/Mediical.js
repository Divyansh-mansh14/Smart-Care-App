const submit = document.querySelector("#medicalForm");

const listMedical = async (event) => {
  event.preventDefault();

  const username = "john";
  const password = "test123";
  const authorizationHeader = "Basic " + btoa(username + ":" + password);

  let date = document.getElementById("date").value;
  let condition = document.getElementById("condition").value;
  let Treatment = document.getElementById("Treatment").value;
  let doctor = document.getElementById("name").value;

  try {
    const response = await fetch("http://localhost:8080/medicals", {
      headers: {
        Authorization: authorizationHeader, // Keep this method
      },
    });

    const response2 = await fetch("http://localhost:8080/medicals", {
      method: "POST",
      headers: {
        "Content-Type": "application/json",
        Authorization: authorizationHeader, // Remove redundant method
      },
      body: JSON.stringify({
        date: date,
        condition: condition,
        treatment: Treatment,
        name: doctor,
      }),
    });

    const data = await response2.json();
    console.log(data);
  } catch (error) {
    console.error("Error:", error.message);
  }
};

submit.addEventListener("submit", listMedical);